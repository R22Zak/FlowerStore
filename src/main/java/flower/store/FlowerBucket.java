package flower.store;

public class FlowerBucket {
    private FlowerPack bucket[] = new FlowerPack[0];

    public void add(FlowerPack pack) {
        FlowerPack newBucket[]  = new FlowerPack[bucket.length + 1];
        System.arraycopy(bucket, 0, newBucket, 0, bucket.length);
        newBucket[bucket.length] = pack;
        bucket = newBucket;
    }
    public double getPrice() {
        double sum = 0;
        for (FlowerPack pack : bucket) {
            sum += pack.getPrice();
        }
        return sum;
    }
}
