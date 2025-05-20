package com.example.task2

data class AccountStatement(
    val transactionType: TransactionType,
    val amount: Double,
    val date: String,
    val time: String,
    val description: String
)

enum class TransactionType {
    Deposit, Withdraw
}