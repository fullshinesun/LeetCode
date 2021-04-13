package problem.challenge.april2021;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class FlattenNestedListIterator implements Iterator<Integer> {
    private List<NestedInteger> nestedList;
    private FlattenNestedListIterator nestedIterator;
    private int index;

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        this.nestedIterator = null;
        index = 0;
    }

    @Override
    public Integer next() {
        if (nestedList.get(index).isInteger()) {
            nestedIterator = null;
            return nestedList.get(index++).getInteger();
        }
        return nestedIterator.next();
    }

    @Override
    public boolean hasNext() {
        if (nestedList.size() <= index) {
            return false;
        }
        if (nestedList.get(index).isInteger()) {
            return true;
        }

        if (nestedIterator == null) {
            nestedIterator = new FlattenNestedListIterator(nestedList.get(index).getList());
        }

        if(!nestedIterator.hasNext()){
            index++;
            nestedIterator = null;
            return hasNext();
        }
        return true;
    }
}

interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}
