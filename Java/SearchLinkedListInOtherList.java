class SearchLinkedListInOtherList{

	public static String isSublist(Node list1, Node list2) {

        if (list1 == null) {
            return "Yes";
        }


        Node ptr2 = list2;
        while (ptr2 != null) {
            Node p1 = list1;
            Node p2 = ptr2;

            while (p1 != null && p2 != null && p1.data == p2.data) {
                p1 = p1.next;
                p2 = p2.next;
            }


            if (p1 == null) {
                return "Yes";
            }

            ptr2 = ptr2.next;
        }

        return "No";
    }


}


