import java.util.ArrayList;

public class Blockchain {

    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<Block>();

        String[] genesisTransaction = {"Satoshi envia 10 bitcoing a ivan", "juan envia 20 bitcoin a ivan"};
        Block genesisBlock = new Block(0, genesisTransaction);
        blockchain.add(genesisBlock);

        String[] secondTransaction = {"ivan envia 10 bitcoin a Satoshi", "Satoshi envia 200 bitcoin a juan"};
        Block block = new Block(genesisBlock.getBlockHash(), secondTransaction);
        blockchain.add(block);

        for( int i = 0; i < blockchain.size(); i++){
            if(i == 0){
                System.out.println("firma digital del bloque genesis: " + blockchain.get(i).getBlockHash());
            }else{
                System.out.println("firma digital del bloque " + (i+1) + ": " + blockchain.get(i).getBlockHash());
            }
        }
    }
    
}
