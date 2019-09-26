java.lang.Integer
````
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
````    
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        System.out.println("a==b:"+(a==b));
        System.out.println("c==d:"+(c==d));
````        
java.lang.Long
同Integer类似
````