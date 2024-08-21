@file:OptIn(ExperimentalLayoutApi::class)

package com.example.gcompose

import android.graphics.Color.argb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
            }
        }
    }

@Composable
fun MainScreen() {
    Column {
        Profile()
        Spacer(modifier = Modifier.height(10.dp))
        Tags()
        Spacer(modifier = Modifier.height(10.dp))
        Status()
        Spacer(modifier = Modifier.height(10.dp))
        Activity()
        ListOrder()

    }
}

@Composable
fun CircularAvatar() {
    val customColor = Color(0xFF2F6D21)
    Box(
        modifier = Modifier
            .size(68.dp)
            .clip(CircleShape)
            .background(customColor)) {
        Text(text = "55",
            fontSize = 20.sp,
            color = androidx.compose.ui.graphics.Color.White,
            modifier = Modifier.align(Alignment.Center))
    }
}
@Composable
fun Profile() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painterResource(id = R.drawable.ic_back)
            , contentDescription = "Icon Back",
            modifier = Modifier
                .size(22.dp))

        CircularAvatar()
        Spacer(modifier = Modifier.height(16.dp))

        Column {
            val customColor = Color(0xFF2F6D21)
            Row {
                Text(text = "843***4455",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 4.dp))
                Spacer(modifier = Modifier.width(108.dp))

                Box(modifier = Modifier.background(customColor, shape = RoundedCornerShape(2.dp)).padding(start = 5.dp, end = 5.dp)) {
                    Row (verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start) {
                        Image(painter = painterResource(id = R.drawable.ic_follow)
                            , contentDescription = "Icon Follow",
                            modifier = Modifier
                                .size(16.dp))
                            Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "Theo dõi",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.White,
                            fontSize = 15.sp,)
                    }
                }
            }

            Row {
                Box (modifier = Modifier.padding(top = 4.dp)) {
                    Row (verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start){
                        Image(painter = painterResource(id = R.drawable.ic_done)
                            , contentDescription = "Icon Done",
                            modifier = Modifier.padding(start = 4.dp)
                                .size(18.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(text = "Đã xác thực SĐT & Địa chỉ",
                            fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

@Composable
fun Tags() {
    FlowRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), verticalArrangement = Arrangement.spacedBy(10.dp)
            )
    {
        val customColor = Color(0xFF01579B)
        val customColor1 = Color(0xFFAD3E02)
        val customColor2 = Color(0xFF01398F)
        val customColor3 = Color(0xFFAA065D)
        val customColor4 = Color(0xFF998B0E)
        Spacer(modifier = Modifier.width(17.dp))
        Box(modifier = Modifier.background(Color.White, shape = RoundedCornerShape(2.dp)).padding(start = 5.dp, end = 5.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    text = "Đã mua",
                    fontSize = 18.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(4.dp))
        Box(modifier = Modifier.background(customColor, shape = RoundedCornerShape(2.dp)).padding(start = 5.dp, end = 5.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    text = "Thiết bị điện tử",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(4.dp))
        Box(modifier = Modifier.background(customColor1, shape = RoundedCornerShape(2.dp)).padding(start = 5.dp, end = 5.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    text = "Voucher",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(4.dp))
        Box(modifier = Modifier.background(customColor2, shape = RoundedCornerShape(2.dp)).padding(start = 5.dp, end = 5.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    text = "Thiết bị điện gia dụng",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(4.dp))
        Box(modifier = Modifier.background(customColor3, shape = RoundedCornerShape(2.dp)).padding(start = 5.dp, end = 5.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
                Text(
                    text = "Mẹ và bé",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier.padding(2.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(4.dp))
        Box(modifier = Modifier.background(customColor4, shape = RoundedCornerShape(2.dp)).padding(start = 5.dp, end = 5.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start) {
            Text(text = "Nhà cửa",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier.padding(2.dp))
            }
        }
    }
    Box (modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .padding(start = 10.dp, end = 10.dp)
        .background(Color.Gray.copy(alpha = 0.5f)))
}

@Composable
fun Status() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Text(
                    text = "--",
                    fontSize = 18.sp,
                    color = Color.Gray
                )

                Text(
                    text = "Độ cháy túi",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }

        Box(
            modifier = Modifier
                .width(2.dp)
                .height(25.dp)
                .padding(top = 10.dp)
                .background(Color.Gray.copy(alpha = 0.5f))
        )
        Spacer(modifier = Modifier.width(10.dp))


        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Text(
                    text = "80",
                    fontSize = 18.sp,
                    color = Color.Black
                )

                Text(
                    text = "ĐH đã đặt",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }

        Box(
            modifier = Modifier
                .width(2.dp)
                .height(25.dp)
                .padding(top = 10.dp)
                .background(Color.Gray.copy(alpha = 0.5f))
        )
        Spacer(modifier = Modifier.width(10.dp))

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Text(
                    text = "--",
                    fontSize = 18.sp,
                    color = Color.Gray
                )

                Text(
                    text = "Thành công",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }

        Box(
            modifier = Modifier
                .width(2.dp)
                .height(25.dp)
                .padding(top = 10.dp)
                .background(Color.Gray.copy(alpha = 0.5f))
        )
        Spacer(modifier = Modifier.width(10.dp))

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Text(
                    text = "Tên lửa",
                    fontSize = 18.sp,
                    color = Color.Black
                )

                Text(
                    text = "Tốc độ nhận",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .padding(start = 10.dp, end = 10.dp)
            .background(Color.Gray.copy(alpha = 0.5f))
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Row (verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start) {
                    Text(
                        text = "38",
                        fontSize = 18.sp,
                        color = Color.Black
                    )
                    Image(
                        painter = painterResource(id = R.drawable.hearts_emoji),
                        contentDescription = "Emoji Hearts",
                        modifier = Modifier.padding(start = 4.dp)
                            .size(18.dp)
                    )
                    Text(
                        text = "10",
                        fontSize = 18.sp,
                        color = Color.Black
                    )
                    Image(
                        painter = painterResource(id = R.drawable.sad_emoji),
                        contentDescription = "Emoji Sad",
                        modifier = Modifier.padding(start = 4.dp)
                            .size(18.dp)
                    )
                }

                Text(
                    text = "Đánh giá",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }

        Box(
            modifier = Modifier
                .width(2.dp)
                .height(25.dp)
                .padding(top = 10.dp)
                .background(Color.Gray.copy(alpha = 0.5f))
        )
        Spacer(modifier = Modifier.width(10.dp))


        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Text(
                    text = "10 Shop",
                    fontSize = 18.sp,
                    color = Color.Black
                )

                Text(
                    text = "Đã ghé thăm",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }

        Box(
            modifier = Modifier
                .width(2.dp)
                .height(25.dp)
                .padding(top = 10.dp)
                .background(Color.Gray.copy(alpha = 0.5f))
        )
        Spacer(modifier = Modifier.width(10.dp))

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Text(
                    text = "11 Shop",
                    fontSize = 18.sp,
                    color = Color.Black
                )

                Text(
                    text = "Đã mua",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }

        Box(
            modifier = Modifier
                .width(2.dp)
                .height(25.dp)
                .padding(top = 10.dp)
                .background(Color.Gray.copy(alpha = 0.5f))
        )
        Spacer(modifier = Modifier.width(10.dp))

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column()
            {
                Text(
                    text = "--",
                    fontSize = 18.sp,
                    color = Color.Black
                )

                Text(
                    text = "Chu kỳ mua",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(8.dp)
            .background(Color.Gray.copy(alpha = 0.5f))
    )
}

@Composable
fun Activity() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceAround
    )
    {
        val customColor = Color(0xFF2F6D21)

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column {
                Text(
                    text = "Hoạt động",
                    fontSize = 18.sp,
                    color = customColor,
                )
            }
        }

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "Nhận hàng",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "2lanstore",
                fontSize = 18.sp,
                color = Color.Black
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "",
                fontSize = 18.sp,
                color = Color.Black
            )
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .padding(start = 10.dp, end = 10.dp)
            .background(Color.Gray.copy(alpha = 0.5f))
    )
}
@Composable
fun ListOrder() {
    Box (modifier = Modifier
        .fillMaxSize()) {
        Box (modifier = Modifier
            .padding(end = 100.dp)) {
            val list = listOf(Pair("YEAHHH! hai đã đặt hàng sản phẩm Giá trị cao ", Date()),
                Pair("YEAHHH! hai đã đặt hàng sản phẩm Thực phẩm khô ", Date()),
                Pair("YEAHHH! phus đã đặt hàng sản phẩm 2023-09-20 ", Date()),
                Pair("YEAHHH! phus đã đặt hàng sản phẩm 2023-09-20, fsdf ", Date()),
                Pair("YEAHHH! hai đã đặt hàng sản phẩm heli, 1 ", Date()),
                Pair("YEAHHH! phus đã đặt hàng sản phẩm 090 ", Date()),
                Pair("YEAHHH! phus đã đặt hàng sản phẩm 090 ", Date()),
                Pair("YEAHHH! hai đã đặt hàng sản phẩm Thực phẩm tươi ", Date()),
                Pair("YEAHHH! hai đã đặt hàng sản phẩm Giá trị thấp ", Date()),
                Pair("YEAHHH! hai đã đặt hàng sản phẩm Thực phẩm sạch ", Date()),
                Pair("YEAHHH! hai đã đặt hàng sản phẩm Giá trị cao ", Date()))
            LazyColumn (modifier = Modifier
                .fillMaxSize()) {
                    items(list.size) {
                        item -> Column (modifier = Modifier.padding(10.dp)) {
                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp)) {
                                Text(text = list[item].first,
                                    fontSize = 16.sp,
                                    modifier = Modifier.weight(1f))
                                val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                                Text(text = dateFormat.format(list[item].second),
                                    color = Color.Gray.copy(alpha = 0.5f),
                                    modifier = Modifier.padding(start = 8.dp))
                            }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(1.dp)
                                .padding(start = 3.dp, end = 3.dp)
                                .background(Color.Gray.copy(alpha = 0.4f))
                        )
                    }
                }
            }
        }

        Column (modifier = Modifier
            .align(Alignment.TopEnd)
                .padding(start = 8.dp, end = 8.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.SpaceEvenly) {
            val customColor = Color(0xFF2F6D21)
            Box (modifier = Modifier
                .background(customColor)
                .height(80.dp)
                .width(90.dp),
                contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = "Icon Call",
                        modifier = Modifier.size(35.dp)
                    )

                    Text(
                        text = "(3)",
                        fontSize = 10.sp,
                        color = Color.White,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }
                    Text (text = "Gọi điện",
                        fontSize = 18.sp,
                        color = Color.White)
            }
            }

            Spacer(modifier = Modifier.height(2.dp))

            Box (modifier = Modifier
                .background(customColor)
                .height(80.dp)
                .width(90.dp),
                contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_chat),
                            contentDescription = "Icon Chat",
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Text (text = "Chat",
                        fontSize = 18.sp,
                        color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(2.dp))

            Box (modifier = Modifier
                .background(customColor)
                .height(80.dp)
                .width(90.dp),
                contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_add),
                            contentDescription = "Icon Add",
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Text (text = "Tạo ĐH",
                        fontSize = 18.sp,
                        color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(2.dp))

            Box (modifier = Modifier
                .background(customColor)
                .height(80.dp)
                .width(90.dp),
                contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_star),
                            contentDescription = "Icon Star",
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Text (text = "Đánh giá",
                        fontSize = 18.sp,
                        color = Color.White)
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}

