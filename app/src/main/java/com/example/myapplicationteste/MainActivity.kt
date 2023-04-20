package com.example.myapplicationteste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationteste.ui.theme.MyApplicationTesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTesteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(2128,160,208)
                ) {
                PlanoDefundo()
                    
                }
                
            }
        }
    }
}
@Composable
fun PlanoDefundo(){
    Image(
        painter = painterResource(id = R.drawable.gradiente_azul_claro_fundo__1_),
        contentDescription =null,
        contentScale= ContentScale.Crop








    )
    Cabecalho()
    Rodape()
}

@Composable
fun Rodape() {
    Column(
        verticalArrangement = Arrangement. Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Contato()
        Contato()
        Contato()
    }
}

@Composable
fun Contato() {
    Row() {
      Image(
          painter =  painterResource(id = R.drawable.icone_azul),
          contentDescription =null,
          modifier= Modifier
      .size(30.dp)
          .clip(CircleShape)
      )
      Text(
          text ="(xx) xxxx-xx xx",
          fontSize = 30.sp,
          color = Color.Black
      )
    }
}

@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter =   painterResource(id =R.drawable.imagem_cabecalho),
            contentDescription =null,
            contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(190.dp)
                        .clip(CircleShape)
        )
        Text(text = "Celina Azevedo",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "medica veterinaria",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold

        )
    }


}


