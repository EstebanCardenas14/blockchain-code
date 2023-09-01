import java.util.Arrays;

public class Block {
    
    private int previousHash;
    private String[] transactions;
    private int blockHash;

    public Block(int previousHash, String[] transactions){
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(this.transactions), this.previousHash};

        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash(){
        return this.previousHash;
    }

    public String[] getTransactions(){
        return this.transactions;
    }

    public int getBlockHash(){
        return this.blockHash;
    }

}
