package pundhir.myproj.simpleblockchain

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    var blockChain: BlockChain = BlockChain()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        println("Mining block 1.....")
        blockChain.addBlock(Block(1, "05June2018_1", Data("Block_1")))

        println("Mining block 2.....")
        blockChain.addBlock(Block(2, "05June2018_2", Data("Block_2")))

        println("Mining block 3.....")
        blockChain.addBlock(Block(3, "05June2018_3", Data("Block_3")))

        println("Mining block 4.....")
        blockChain.addBlock(Block(4, "05June2018_4", Data("Block_4")))

        println("Mining block 5.....")
        blockChain.addBlock(Block(5, "05June2018_5", Data("Block_5")))

        println("Mining block 6.....")
        blockChain.addBlock(Block(6, "05June2018_6", Data("Block_6")))



//        blockChain.chain.forEach { it.displayBlock() }
//        println ("isBlockChain Valid = " + blockChain.isChainValid())
//
//
//        println("#######################################")
//
//        blockChain.chain[1].data = Data("Tempored data")
//        blockChain.chain[1].hash =  blockChain.chain[1].calculateHash()
//        blockChain.chain.forEach { it.displayBlock() }
//        println ("isBlockChain Valid = " + blockChain.isChainValid())
    }

}
