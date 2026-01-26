class RandomizedSet {
   
       List<Integer> list = new ArrayList<>();
        Random random = new Random();
      

    
    public boolean insert(int val)//returns true if the item was not present else false//
    {
        if(list.contains(val)){
            return false;
        }
        list.add(val);
        return true;
        
    }
    
    public boolean remove(int val)//retrun true if item was present else false
    {
        if(!list.contains(val)){
            return false;
        }
        list.remove((Integer)val);
        return true;
        

    }
    
    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */