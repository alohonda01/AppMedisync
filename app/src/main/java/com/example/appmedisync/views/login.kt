package com.example.appmedisync.views

import com.example.appmedisync.R
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun loginScreen(){
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp, bottom = 30.dp, start = 30.dp, end = 30.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_prueba), // Reemplaza con tu imagen
            contentDescription = "Descripción de la imagen",
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        )

        Text(
            text = "Inicia sesion o registrate",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 80.dp, bottom = 30.dp)
                .fillMaxWidth()
        )


        //FORMULARIO DE REGISTRO
        var texto by remember { mutableStateOf("") }
        OutlinedTextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 15.dp),
            singleLine = true
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Button(
                onClick = { println("Botón 1 presionado") },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 2.dp),
                shape = RectangleShape
            ) {
                Text("Login")
            }

            Button(onClick = { println("Botón 2 presionado") },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 2.dp),
                shape = RectangleShape
            ) {
                Text("Sign up")
            }
        }

    }
}