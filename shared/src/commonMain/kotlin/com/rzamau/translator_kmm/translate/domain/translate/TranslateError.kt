package com.rzamau.translator_kmm.translate.domain.translate

enum class TranslateError {
    SERVICE_UNAVAILABLE,
    SERVER_ERROR,
    CLIENT_ERROR,
    UNKNOWN_ERROR,
}

class TranslateException(val error: TranslateError): Exception(
    message = "An error occured when translating: $error"
)