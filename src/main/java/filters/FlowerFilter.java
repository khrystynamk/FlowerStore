package filters;
import flower.Item;

public class FlowerFilter implements Filter{
    @Override
    public boolean match(Item item){
        return true;
    }
}
