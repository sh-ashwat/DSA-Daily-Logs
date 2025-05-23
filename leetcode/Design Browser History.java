class BrowserHistory {

        class Node {
            String url;
            Node next;
            Node prev;
            Node (String url){
                this.url = url;
            }
        }
     private Node currentNode;
    

    public BrowserHistory(String homepage) {
        currentNode = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        currentNode.next = newNode;
        newNode.prev = currentNode;
        currentNode = newNode;
    }
    
    public String back(int steps) {
        while (steps > 0 && currentNode.prev != null){
            currentNode =  currentNode.prev;
            steps--;
        }
        return currentNode.url;
    }
    
    public String forward(int steps) {
        while (steps > 0 && currentNode.next != null){
            currentNode = currentNode.next;
            steps--;
        }
        return currentNode.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
