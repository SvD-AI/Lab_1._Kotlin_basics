sealed class NetworkResult
data class Success(val data: String) : NetworkResult()
data class Error(val errorMsg: String) : NetworkResult()

fun processResult(result: NetworkResult): String = when (result) {
    is Error -> "Помилка: ${result.errorMsg}"
    is Success -> "Дані: ${result.data}"
}