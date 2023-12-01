package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2023-11-28
 */
public class _1670DesignFrontMiddleBackQueue {

    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        queue.pushMiddle(4);
        System.out.println(queue.popFront());
        System.out.println(queue.popMiddle());
        System.out.println(queue.popMiddle());
        System.out.println(queue.popBack());
        System.out.println(queue.popFront());
    }

    public static class FrontMiddleBackQueue {

        Node head;

        int length;

        Node mid;

        public static class Node {
            int val;

            Node next;

            Node prev;
        }

        public FrontMiddleBackQueue() {
            head = new Node();
            length = 0;
        }

        public void pushFront(int val) {
            if (length == 0) {
                head.val = val;
            } else {
                Node newNode = new Node();
                newNode.val = val;
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            length++;
            mid =
        }

        public void pushMiddle(int val) {
            if (length == 0) {
                head.val = val;
                length++;
            } else if (length == 1) {
                Node newNode = new Node();
                newNode.val = val;
                newNode.prev = head;
                head.next = newNode;
                mid = newNode;
                length++;
            } else {
                Node newNode = new Node();
                newNode.val = val;
                newNode.prev = mid.prev;
                newNode.next = mid;
                mid.prev.next = newNode;
                mid.prev = newNode;
                if (length % 2 == 0) {
                    mid = mid.prev;
                }
                length++;
            }
        }

        public void pushBack(int val) {
            if (length == 0) {
                head.val = val;
                length++;
            } else {
                Node newNode = new Node();
                newNode.val = val;
                Node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
                newNode.prev = lastNode;
                length++;
                if (length % 2 == 1) {
                    mid = mid.next;
                }
            }
        }

        public int popFront() {
            if (length == 0) {
                return -1;
            } else if (length == 1) {
                int val = head.val;
                head = null;
                length--;
                return val;
            } else {
                int val = head.val;
                head = head.next;
                head.prev = null;
                length--;
                if (length % 2 == 1) {
                    mid = mid.next;
                }
                return val;
            }
        }

        public int popMiddle() {
            if (length == 0) {
                return -1;
            } else if (length == 1) {
                int val = head.val;
                head = null;
                length--;
                return val;
            } else if (length == 2) {
                int val = head.next.val;
                head.next = null;
                length--;
                return val;
            } else {
                int val = mid.val;
                mid.prev.next = mid.next;
                mid.next.prev = mid.prev;
                if (length % 2 == 0) {
                    mid = mid.next;
                } else {
                    mid = mid.prev;
                }
                length--;
                return val;
            }
        }

        public int popBack() {
            if (length == 0) {
                return -1;
            } else if (length == 1) {
                int val = head.val;
                head = null;
                length--;
                return val;
            } else {
                Node lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                int val = lastNode.val;
                lastNode.prev.next = null;
                length--;
                if (length % 2 == 0) {
                    mid = mid.prev;
                }
                return val;
            }
        }
    }
}
