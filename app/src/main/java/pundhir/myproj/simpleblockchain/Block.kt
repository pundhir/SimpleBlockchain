package pundhir.myproj.simpleblockchain

import java.security.MessageDigest

class Block (var index: Int, var timestamp: String, var data: Data, var previousHash: String = "0") {
    var hash: String = this.calculateHash()
    var nonce = 0

    fun calculateHash(): String {
        return (this.index.toChar() + this.previousHash + this.timestamp + this.data.toString() + this.nonce).sha512()
    }


    fun mineBlock(difficulty: Int) {
        var sb = StringBuilder()
        for (i in 1..difficulty) {
            sb.append("0")
        }

        while (!this.hash.substring(0, difficulty).equals(sb.toString())) {
            this.nonce++
            this.hash = calculateHash()
        }
        println("Block hash = "+ this.hash)
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
        println("********************************************")
        println("Block = "+this.index.toString())
        println("TimeStamp = "+this.timestamp)
        println("Transaction Data = "+this.data.transaction)
        println("Previous Hash = "+this.previousHash)
        println("Bock Hash = "+this.hash)
    }
}