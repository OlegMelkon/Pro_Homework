package de.telran.Melkonov.Oleg.hw20230822;

import java.util.*;

public class MyArrayListHW implements List<Integer>{
    public static void main(String[] args) {

    }
    Integer[] array = new Integer[0];
    int originalSize = 0;
    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) return true;
        return false;
    }

    @Override
    public boolean add(Integer value) {
        Integer[] aC = Arrays.copyOf(array, array.length+1);
        aC[aC.length-1] = value;
        array = aC;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size(); i++){
            if (array[i] == o) return true;
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {

        return Arrays.stream(array).iterator();
    }

    @Override
    public boolean remove(Object o) {
        int index = -1;
        int i = 0;
        while(i < array.length || array[i] != o){
            if (array[i] == o){
                index = i;
            }
            i++;
        }

        if (i == -1) return false;
        else {
            Integer[] arrayP1 = Arrays.copyOfRange(array, 0, index);

            Integer[] arrayP2 = Arrays.copyOfRange(array, index+1, array.length);

            Integer[] newArray = new Integer[array.length-1];

            for (int j = 0; j < arrayP1.length; j++){
                newArray[j] = arrayP1[j];
            }

            for (int j = 0; j < arrayP2.length; j++){
                newArray[j+(index)] = arrayP2[j];
            }
            array = newArray;
        }

        return true;
    }

    @Override
    public Integer get(int index) {

        return array[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        int prev = array[index];
        array[index] = element;
        return prev;
    }

    @Override
    public void add(int index, Integer element) {
        Integer[] aC = Arrays.copyOf(array, array.length+1);
        for (int i = aC.length-1; i > index; i--){
            aC[i] = array[i-1];
        }
        aC[index] = element;
        array = aC;
    }

    @Override
    public Integer remove(int index) {

        int element = array[index];

        Integer[] arrayP1 = Arrays.copyOfRange(array, 0, index);

        Integer[] arrayP2 = Arrays.copyOfRange(array, index+1, array.length);

        Integer[] newArray = new Integer[array.length-1];

        for (int i = 0; i < arrayP1.length; i++){
            newArray[i] = arrayP1[i];
        }

        for (int i = 0; i < arrayP2.length; i++){
            newArray[i+(index)] = arrayP2[i];
        }
        array = newArray;

        return element;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size(); i++){
            if (array[i] == o) return i;
        }
        return -1;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++){
            array[i] = 0;
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size()-1; i >= 0; i--){
            if (array[i] == o) return i;
        }
        return -1;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
}
