package JavaCore.Lesson_13_Iterator_Comparator.task3;

import java.util.ArrayList;
import java.util.Collections;
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

    public void removeFromStorage(Commodity commodity) {
        storageList.remove(commodity);
    }

    public void replaceInStorage(int index, Commodity newCommodity) {
        storageList.set(index, newCommodity);
    }

    public void sortByName() {
        Collections.sort(storageList);
    }

    public void sortByLength() {
        storageList.sort(new CommodityLengthComparator());
    }

    public void sortByWeight() {
        storageList.sort(new CommodityWeightComparator());
    }

    public void sortByWidth() {
        storageList.sort(new CommodityWidthComparator());
    }

    public void print(int index) {
        System.out.println(storageList.get(index));
    }


}
