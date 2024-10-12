package flower.store;

public class FlowerBucket {
    private FlowerPack bucket[] = new FlowerPack[0];

    public void add(FlowerPack pack) {
        FlowerPack new_bucket[]  = new FlowerPack[bucket.length + 1];
        System.arraycopy(bucket, 0, new_bucket, 0, bucket.length);
        new_bucket[bucket.length]=pack;
        bucket=new_bucket;
    }
    public double getPrice(){
        double sum = 0;
        for (FlowerPack pack : bucket) {
            sum += pack.getPrice();
        }
        return sum;
    }
}
