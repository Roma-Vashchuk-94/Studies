package JavaCore.Lesson_13_Iterator_Comparator.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Storage {

    private List<Commodity> storageList;

    public Storage() {
        storageList = new ArrayList<>();
    }

    public List<Commodity> getStorageList() {
        return storageList;
    }

    public void setStorageList(List<Commodity> storageList) {
        this.storageList = storageList;
    }

    public void addToStorage(Commodity commodity) {
        storageList.add(commodity);
    }

    public void removeFromStorage(int index) {
        storageList.remove(index);
    }

    public void replaceInStorage(int index, Commodity newCommodity) {
        storageList.set(index, newCommodity);
    }

    public void sortByName() {
        Collections.sort(storageList);
    }

    public void sortByLength() {
        storageList.sort(commodityLengthComparator);
    }

    public void sortByWeight() {
        storageList.sort(commodityWeightComparator);
    }

    public void sortByWidth() {
        storageList.sort(commodityWidthComparator);
    }

    public void print(int index) {
        System.out.println(storageList.get(index));
    }

    Comparator<Commodity> commodityLengthComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getLength() - o2.getLength();
        }
    };

    Comparator<Commodity> commodityWeightComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWeight() - o2.getWeight();
        }
    };

    Comparator<Commodity> commodityWidthComparator = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.getWidth() - o2.getWidth();
        }
    };




}
