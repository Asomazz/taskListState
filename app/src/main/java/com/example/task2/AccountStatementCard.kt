package com.example.task2

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task2.AccountStatement
import com.example.task2.TransactionType


@Composable
fun AccountStatementCard(statement: AccountStatement) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (statement.transactionType == TransactionType.Deposit)
                Color(0xFFDFF5E3) else Color(0xFFFFE5E5)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = statement.transactionType.name.uppercase(),
                color = if (statement.transactionType == TransactionType.Deposit)
                    Color(0xFF2E7D32) else Color(0xFFC62828),
                fontSize = 18.sp
            )
            Text("Amount: \$${statement.amount}", fontSize = 16.sp)
            Text("Date: ${statement.date}", fontSize = 14.sp)
            Text("Time: ${statement.time}", fontSize = 14.sp)
            Text(statement.description, fontSize = 14.sp, color = Color.Gray)
        }
    }
}
