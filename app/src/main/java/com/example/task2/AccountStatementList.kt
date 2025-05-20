package com.example.task2

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AccountStatementList(statements: List<AccountStatement>) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Account Statements",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LazyColumn(contentPadding = PaddingValues(bottom = 100.dp)) {
            items(statements) { statement ->
                AccountStatementCard(statement)
            }
        }
    }
}
