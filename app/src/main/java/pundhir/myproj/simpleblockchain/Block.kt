package pundhir.myproj.simpleblockchain

import java.security.MessageDigest

class Block (var index: Int, var timestamp: String, var data: Data, var previousHash: String = " ") {
    var hash: String = this.calculateHash()

    fun calculateHash(): String {
        return (this.index.toChar() + this.previousHash + this.timestamp + this.data.toString()).sha512()
    }

    fun String.sha512(): String {
        return this.hashWithAlgorithm("SHA-512")
    }

    private fun String.hashWithAlgorithm(algorithm: String): String {
        val digest = MessageDigest.getInstance(algorithm)
        val bytes = digest.digest(this.toByteArray(Charsets.UTF_8))
        return bytes.fold("", { str, it -> str + "%02x".format(it) })
    }


    fun displayBlock() {
        println(this.index.toChar() + " - " + this.timestamp + " - " + this.data.toString() + " - " + this.hash)
    }
}