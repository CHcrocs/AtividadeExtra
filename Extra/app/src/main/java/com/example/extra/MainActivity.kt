package com.example.extra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extra.ui.theme.ExtraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MunchkinMain()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MunchkinMain() {
    val numJogadores = 3

    var nome by remember { mutableStateOf("") }
    var poder by remember { mutableStateOf(0) }
    var level by remember { mutableStateOf(1) }
    var equipBonus by remember { mutableStateOf(0) }
    var modificador by remember { mutableStateOf(0) }

    var jogador1 by remember { mutableStateOf(listOf<Jogador>()) }

    LazyColumn {
        items(numJogadores) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                TextField(
                    value = nome,
                    onValueChange = { nome = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level + equipBonus + modificador}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level <= 0) {
                            //Eliminado
                        } else {
                            level--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level", fontSize = 20.sp)
                    Button(onClick = {
                        if (level >= 10) {
                            //level maximo
                        } else {
                            level++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (equipBonus <= 0) {
                            //Limite minimo
                        } else {
                            equipBonus--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $equipBonus", fontSize = 20.sp)
                    Button(onClick = {
                        if (equipBonus >= 40) {
                            //Limite maximo
                        } else {
                            equipBonus++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador <= -5) {
                            //Limite minimo
                        } else {
                            modificador--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador >= 10) {
                            //Limite maximo
                        } else {
                            modificador++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }
    }
}