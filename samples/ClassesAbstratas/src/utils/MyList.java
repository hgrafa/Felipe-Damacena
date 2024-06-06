package utils;

import automoveis.Veiculo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<Veiculo> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Veiculo> iterator() {
        return null;
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
    public boolean add(Veiculo veiculo) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Veiculo> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Veiculo> c) {
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

    }

    @Override
    public Veiculo get(int index) {
        return null;
    }

    @Override
    public Veiculo set(int index, Veiculo element) {
        return null;
    }

    @Override
    public void add(int index, Veiculo element) {

    }

    @Override
    public Veiculo remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Veiculo> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Veiculo> listIterator(int index) {
        return null;
    }

    @Override
    public List<Veiculo> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
