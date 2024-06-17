package com.example.design.patten.practise.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BroserHistory {
    private List<String> url = new java.util.ArrayList<>();

    public void push(String s){
        url.add(s);
    }

    public String pop(){
        String current = url.get(url.size()-1);
        url.remove(current);
        return current;
    }

    public Iterator createItorato(){
        return new ArrayList(this);
    }
    class ArrayList implements Iterator{
        private BroserHistory broserHistory;
        private int next;
        public ArrayList(BroserHistory broserHistory) {
            this.broserHistory = broserHistory;
        }

        @Override
        public boolean hasNext() {
            return next<url.size();
        }

        @Override
        public void next() {
            next++;
        }

        @Override
        public String current() {
            return url.get(next);
        }
    }
}
