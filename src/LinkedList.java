class LinkedList<T> implements SimpleCollection<T> {
    private Node<T> head;
    private Node<T> last;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T o) {
        Node<T> start = head;
        while (start != null) {
            if (start.getData() == o) {
                return true;
            }
            start = start.getNext();
        }
//        for (int i = 0; i < size - 1; i++) {
//            if (start.getData() == o) {
//                return true;
//            }
//            start = start.getNext();
//        }
        return false;
    }

    @Override
    public T[] toArray() {
        Node<T> next = this.head;
        T[] array = (T[]) new Object[size];
        int cnt = 0;
        if (this.size > 0) {
            while (next != null) {
                array[cnt] = next.getData();
                next = next.getNext();
                cnt++;
            }
        }
        return array;
    }

    @Override
    public void add(T data) {
        Node<T> newNode = new Node<T>(null, data, null);
        if (head == null) {
            this.last = newNode;
            this.head = newNode;
        } else {
            this.last.setNext(newNode);
            newNode.setPrev(this.last);
            this.last = newNode;
        }

        this.size++;
    }


    public void add(T data, int index) {
        if (index >= size || size == 0) {
            this.add(data);

        } else {
            Node<T> start = this.head;
            Node<T> newNode = new Node<T>(null, data, null);
            for (int i = 0; i <= size; i++) {
                if (i == index) {
                    Node<T> temp = start.getPrev();
                    start.setPrev(newNode);
                    newNode.setNext(start);
                    if (index == 0) {
                        this.head = newNode;

                    } else {
                        temp.setNext(newNode);
                        newNode.setPrev(temp);
                        break;
                    }
                }
                if (start != null) {
                    start = start.getNext();
                }

            }
            this.size++;
        }
    }

    public void removeInd(int index) {
        Node<T> next = this.head;
        for (int i = 0; i <= size; i++) {
            if (i == index) {
                unlink(next);
                next = next.getNext();
            }
        }
    }

    @Override
    public void remove(T value) {
        Node<T> next = this.head;
        while (next != null) {
            if (next.getData() == value) {
                unlink(next);
            }
            next = next.getNext();
        }
    }

    private void unlink(Node<T> node) {
        node.setData(null);
        if (node.getPrev() == null && node.getNext() == null) {
            node.setData(null);
        } else {
            if (node.getPrev() == null) {
                this.head = node.getNext();
                node.getNext().setPrev(null);
                node.setNext(null);
            } else if (node.getNext() == null) {
                this.last = node.getPrev();
                node.getPrev().setNext(null);
                node.setPrev(null);
            } else {
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
                node.setPrev(null);
                node.setNext(null);
            }
        }
        this.size--;
    }

    public void notOptimizedReverse(int coef) {
        int stopCounter = this.size;
        Node<T> next = this.head;
        int indexCounter = 0;
        int test = 0;
        while (coef <= stopCounter) {
            for (int i = 1; i <= coef; i++) {
                test++;
                if (i == coef) {
                    Node<T> last = next;
                    Node<T> last2;
                    if (next.getNext() != null) {
                        next = next.getNext();
                    }
                    for (int k = 1; k <= coef; k++) {
                        test++;
                        last2 = last.getPrev();
                        add(last.getData(), indexCounter);
                        unlink(last);
                        last = last2;
                        indexCounter++;
                    }
                    if (next.getPrev() != null) {
                        next = next.getPrev();
                    }
                }
                if (next.getNext() != null) {
                    next = next.getNext();
                }
            }
            stopCounter -= coef;
        }
        System.out.println(test);
    }

    public void reverse(int coef){
        int stopCounter = this.size;
        Node<T> next = this.head;
        int index = 0;
        int test = 0;
        while (coef <= stopCounter) {
            for (int i = 0; i < coef; i++) {
                test++;
                this.add(next.getData(), index);
                if (next.getNext() != null){
                    next = next.getNext();
                    unlink(next.getPrev());
                }else {
                    unlink(next);
                }
            }
            index +=coef;
            stopCounter -= coef;
        }
        System.out.println(test);
    }


    @Override
    public void clear() {
        Node<T> next = this.head;
        while (next != null) {
            next = next.getNext();
            removeInd(0);
        }
    }
}