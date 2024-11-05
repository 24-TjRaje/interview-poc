package com.interview.interview_poc;

import java.util.*;

public class SwapLeftRight {

    public static List<Integer> swapToLeft( Integer[] input, Integer toMove, String direction) throws Exception {

        //1. Convert the incoming Integer[] to list using List.of(arrayName);
        List<Integer> inputList = List.of(input);

        //2. Create 2 more ArrayList to hold 1. All numbers other than one to move. 2. All occurences
        //of number to be moved.
        List<Integer> otherEle = new ArrayList<>();
        List<Integer> moveEle = new ArrayList<>();

        //3. In the first list, use the stream api and filter method , to filter out all the elements
        //that are not the one that is to be moved and save to a list using toList().
        otherEle = inputList.stream()
                .filter(i -> !(Objects.equals(i, toMove)))
                .toList();

        //4. In the second list, use the stream api and filter method, to filter out elements that are
        //ones to be moved and save to other list using toList();
        moveEle = inputList.stream()
                .filter(i -> (Objects.equals(i, toMove)))
                .toList();

        //5. Check for the direction, if it is left, intialise a new list with the list having
        //the list of number that is to be moved. Add the other list elements to this new list to
        //get the final answer
        if(direction.equalsIgnoreCase("left")) {
            List<Integer> result = new ArrayList<>(moveEle);
            result.addAll(otherEle);
            return result;
        }
        //6. Check for the direction, if it is right, intialise a new list with the list having
        //   the list of number that is not to be moved. Add the other list elements to this new list to
        //   get the final answer
        else if (direction.equalsIgnoreCase("right")) {
            List<Integer> result = new ArrayList<>(otherEle);
            result.addAll(moveEle);
            return result;
        } else {
            throw new Exception("The provided direction is incorrect!!!");
        }
    }
}
