package pundhir.myproj.simpleblockchain

class BlockChain(){

    var chain: ArrayList<Block> = ArrayList()

    init {
        println("adding genesis block")
        chain.add(this.createGenesisBlock())
    }

    private fun createGenesisBlock(): Block {
        println("inside createGenesisBlock method")
        return Block(1, "05June2018_0", Data("Block_0"), "0")
    }


    fun addBlock(block: Block) {
        block.previousHash = this.chain.last().hash
        block.hash = block.calculateHash()
        this.chain.add(block)
    }

}