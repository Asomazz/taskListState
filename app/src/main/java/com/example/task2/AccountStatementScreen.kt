package com.example.task2


import androidx.compose.runtime.Composable

@Composable
fun AccountStatementScreen() {
    val dummyStatements = listOf(
        AccountStatement(TransactionType.Deposit, 150.0, "2025-05-20", "14:30", "Salary"),
        AccountStatement(TransactionType.Withdraw, 50.0, "2025-05-19", "10:15", "Groceries"),
        AccountStatement(TransactionType.Deposit, 200.0, "2025-05-18", "08:00", "Refund"),
        AccountStatement(TransactionType.Withdraw, 75.0, "2025-05-17", "12:45", "Online Purchase"),
        AccountStatement(TransactionType.Withdraw, 100.0, "2025-05-16", "16:20", "ATM Withdrawal")
    )

    AccountStatementList(statements = dummyStatements)
}

