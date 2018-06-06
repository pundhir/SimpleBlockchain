package pundhir.myproj.simpleblockchain

class BlockChain() {

    var chain: ArrayList<Block> = ArrayList()

    init {
        println("adding genesis block")
        chain.add(this.createGenesisBlock())
    }

    private fun createGenesisBlock(): Block {
        println("inside createGenesisBlock method")
        return Block(0, "05June2018_0", Data("Block_0"), "0")
    }


    fun addBlock(block: Block) {
        block.previousHash = this.chain.last().hash
        block.hash = block.calculateHash()
        this.chain.add(block)
    }

    fun isChainValid(): Boolean {
        for (i in 1..this.chain.size - 1) {
            var currentBock = this.chain[i]
            var previousBlock = this.chain[i - 1]
            if (!currentBock.hash.equals(currentBock.calculateHash())
                    || !currentBock.previousHash.equals(previousBlock.hash)) return false
        }
        return true
    }
}