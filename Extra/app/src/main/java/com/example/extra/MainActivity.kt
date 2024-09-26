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
    //Jogador 1
    var nome by remember { mutableStateOf("") }
    var level by remember { mutableStateOf(1) }
    var equipBonus by remember { mutableStateOf(0) }
    var modificador by remember { mutableStateOf(0) }

    //Jogador 2
    var nome2 by remember { mutableStateOf("") }
    var level2 by remember { mutableStateOf(1) }
    var equipBonus2 by remember { mutableStateOf(0) }
    var modificador2 by remember { mutableStateOf(0) }

    //Jogador 3
    var nome3 by remember { mutableStateOf("") }
    var level3 by remember { mutableStateOf(1) }
    var equipBonus3 by remember { mutableStateOf(0) }
    var modificador3 by remember { mutableStateOf(0) }

    //Jogador 4
    var nome4 by remember { mutableStateOf("") }
    var level4 by remember { mutableStateOf(1) }
    var equipBonus4 by remember { mutableStateOf(0) }
    var modificador4 by remember { mutableStateOf(0) }

    //Jogador 5
    var nome5 by remember { mutableStateOf("") }
    var level5 by remember { mutableStateOf(1) }
    var equipBonus5 by remember { mutableStateOf(0) }
    var modificador5 by remember { mutableStateOf(0) }

    //Jogador 6
    var nome6 by remember { mutableStateOf("") }
    var level6 by remember { mutableStateOf(1) }
    var equipBonus6 by remember { mutableStateOf(0) }
    var modificador6 by remember { mutableStateOf(0) }

    LazyColumn {
        //Jogador 1
        item {
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

        //Jogador 2
        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                TextField(
                    value = nome2,
                    onValueChange = { nome2 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level2 + equipBonus2 + modificador2}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level2 <= 0) {
                            //Eliminado
                        } else {
                            level2--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level2", fontSize = 20.sp)
                    Button(onClick = {
                        if (level2 >= 10) {
                            //level maximo
                        } else {
                            level2++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (equipBonus2 <= 0) {
                            //Limite minimo
                        } else {
                            equipBonus2--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $equipBonus2", fontSize = 20.sp)
                    Button(onClick = {
                        if (equipBonus2 >= 40) {
                            //Limite maximo
                        } else {
                            equipBonus2++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador2 <= -5) {
                            //Limite minimo
                        } else {
                            modificador2--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador2", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador2 >= 10) {
                            //Limite maximo
                        } else {
                            modificador2++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        //Jogador 3
        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                TextField(
                    value = nome3,
                    onValueChange = { nome3 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level3 + equipBonus3 + modificador3}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level3 <= 0) {
                            //Eliminado
                        } else {
                            level3--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level3", fontSize = 20.sp)
                    Button(onClick = {
                        if (level3 >= 10) {
                            //level maximo
                        } else {
                            level3++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (equipBonus3 <= 0) {
                            //Limite minimo
                        } else {
                            equipBonus3--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $equipBonus3", fontSize = 20.sp)
                    Button(onClick = {
                        if (equipBonus3 >= 40) {
                            //Limite maximo
                        } else {
                            equipBonus3++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador3 <= -5) {
                            //Limite minimo
                        } else {
                            modificador3--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador3", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador3 >= 10) {
                            //Limite maximo
                        } else {
                            modificador3++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        //Jogador 4
        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                TextField(
                    value = nome4,
                    onValueChange = { nome4 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level4 + equipBonus4 + modificador4}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level4 <= 0) {
                            //Eliminado
                        } else {
                            level4--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level4", fontSize = 20.sp)
                    Button(onClick = {
                        if (level4 >= 10) {
                            //level maximo
                        } else {
                            level4++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (equipBonus4 <= 0) {
                            //Limite minimo
                        } else {
                            equipBonus4--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $equipBonus4", fontSize = 20.sp)
                    Button(onClick = {
                        if (equipBonus4 >= 40) {
                            //Limite maximo
                        } else {
                            equipBonus4++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador4 <= -5) {
                            //Limite minimo
                        } else {
                            modificador4--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador4", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador4 >= 10) {
                            //Limite maximo
                        } else {
                            modificador4++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        //Jogador 5
        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                TextField(
                    value = nome5,
                    onValueChange = { nome5 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level5 + equipBonus5 + modificador5}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level5 <= 0) {
                            //Eliminado
                        } else {
                            level5--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level5", fontSize = 20.sp)
                    Button(onClick = {
                        if (level5 >= 10) {
                            //level maximo
                        } else {
                            level5++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (equipBonus5 <= 0) {
                            //Limite minimo
                        } else {
                            equipBonus5--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $equipBonus5", fontSize = 20.sp)
                    Button(onClick = {
                        if (equipBonus5 >= 40) {
                            //Limite maximo
                        } else {
                            equipBonus5++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador5 <= -5) {
                            //Limite minimo
                        } else {
                            modificador5--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador5", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador5 >= 10) {
                            //Limite maximo
                        } else {
                            modificador5++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        //Jogador 6
        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                TextField(
                    value = nome6,
                    onValueChange = { nome6 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level6 + equipBonus6 + modificador6}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level6 <= 0) {
                            //Eliminado
                        } else {
                            level6--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level6", fontSize = 20.sp)
                    Button(onClick = {
                        if (level6 >= 10) {
                            //level maximo
                        } else {
                            level6++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (equipBonus6 <= 0) {
                            //Limite minimo
                        } else {
                            equipBonus6--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $equipBonus6", fontSize = 20.sp)
                    Button(onClick = {
                        if (equipBonus6 >= 40) {
                            //Limite maximo
                        } else {
                            equipBonus6++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador6 <= -5) {
                            //Limite minimo
                        } else {
                            modificador6--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador6", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador6 >= 10) {
                            //Limite maximo
                        } else {
                            modificador6++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }
    }
}