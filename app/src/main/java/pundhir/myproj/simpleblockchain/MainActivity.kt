package pundhir.myproj.simpleblockchain

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var blockChain: BlockChain = BlockChain()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        blockChain.addBlock(Block(1, "05June2018_1", Data("Block_1")))
        blockChain.addBlock(Block(2, "05June2018_2", Data("Block_2")))
        blockChain.addBlock(Block(3, "05June2018_3", Data("Block_3")))
        blockChain.addBlock(Block(4, "05June2018_4", Data("Block_4")))
        blockChain.addBlock(Block(5, "05June2018_5", Data("Block_5")))
        blockChain.addBlock(Block(6, "05June2018_6", Data("Block_6")))

        blockChain.chain.forEach { it.displayBlock() }

    }
}
