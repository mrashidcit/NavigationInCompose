package com.rashid.saleem.navigationincompose.auth.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rashid.saleem.navigationincompose.R
import com.rashid.saleem.navigationincompose.auth.login.LoginAction
import com.rashid.saleem.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun LoginContent(
    onAction: (LoginAction) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(50.dp))

        Icon(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(30.dp))
        TextField(
            value = "",
            onValueChange = { },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    text = "Email"
                )
            }
        )
        Spacer(modifier = Modifier.height(6.dp))
        TextField(
            value = "",
            onValueChange = { },
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    text = "Password"
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Info, // Replace with no-visibility icon
                    contentDescription = null
                )
            }
        )
        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "Forgot Password ?",
                modifier = Modifier
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple()
                    ) {
                        onAction(LoginAction.ForgotPasswordOnClick)
                    },
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = {
                onAction(LoginAction.LogInOnClick)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        ) {
            Text("Login")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                onAction(LoginAction.SignUpOnClick)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Text("SignUp")
        }
    }
}


@Preview
@Composable
private fun LoginContentPreview() {
    NavigationInComposeTheme {
        Surface {
            LoginContent(
                onAction = { }
            )
        }
    }
}
















