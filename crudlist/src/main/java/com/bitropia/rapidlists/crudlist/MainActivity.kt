package com.bitropia.rapidlists.crudlist

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

import com.bitropia.rapidlists.central.ui.theme.RapidListsTheme
import com.bitropia.rapidlists.central.ui.theme.textField
import com.bitropia.rapidlists.crudlist.ui.viewmodels.ListHeaderViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import javax.inject.Inject

import com.bitropia.rapidlists.crudlist.domain.entities.ListHeader
import com.bitropia.rapidlists.crudlist.usecases.SaveListHeaderUseCase

@AndroidEntryPoint
class MainActivity @Inject constructor() : AppCompatActivity() {
    @Inject
    lateinit var saveListHeader : SaveListHeaderUseCase
//aver
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            MainContent(saveListHeader)

        }
    }
}




@Composable
fun MainContent(


    saveListHeader:  SaveListHeaderUseCase,
    viewModel: ListHeaderViewModel =  ListHeaderViewModel(saveListHeader)

) {

    MainScreen(
        viewModel = viewModel
    )


}

@Composable
fun MainScreen(
    viewModel: ListHeaderViewModel
) {

   // val (value, onValueChange) = rememberSaveable { mutableStateOf("") }
    var headerdescription by rememberSaveable { mutableStateOf("") }

    val onheaderdescriptionTextChange = { text : String ->
        headerdescription = text
    }


    RapidListsTheme{

        Column(

            Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            OutlinedTextField(


                value = headerdescription,
                onValueChange = onheaderdescriptionTextChange,
                label = { Text("Description") },
                textStyle = TextStyle(color = MaterialTheme.colors.textField,
                    fontWeight = FontWeight.Normal),

                )
            val context = LocalContext.current

            Button(

                onClick = {

                    Toast.makeText(
                        context,
                        "Guardando.... " + headerdescription,

                        Toast.LENGTH_SHORT
                    ).show()

                   viewModel.saveListHeader(ListHeader(0,
                        headerdescription))
                },
                modifier = Modifier.padding(all = Dp(10F)),
                enabled = true,
                shape = MaterialTheme.shapes.medium,
            )

            {
                Text(text = "Guardar", color = Color.White)
            }
        }
    }
}


