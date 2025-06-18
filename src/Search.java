public class Search {
    Node top;

    public void push(String search) {
        Node newNode = new Node(search);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Infelizmente a pilha está vazia!");
        } else {
            System.out.println("Página removida: " + top.Search);
            top = top.next;
            System.out.println("Última página a ser visitada: " + top.Search);
        }
    }
    public void displaySearches() {
        if (top == null) {
            System.out.println("Infelizmente a pilha está vazia!");
        } else {
            Node temp = top;
            System.out.println("Últimas pesquisas feitas:");
            while (temp != null) {
                System.out.println(temp.Search);
                temp = temp.next;
            }
        }
    }
        public void IsNull() {
            if (top == null) {
                System.out.println("O histórico está vazio!");
            } else {
                System.out.println("Há pesquisas que foram feitas!");
            }
        }
        public void DisplayLastSearch(){
            if(top!=null){

                System.out.println("Última pesquisa realizada: " + top.Search);
            }
            }

    }

