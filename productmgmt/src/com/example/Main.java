package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        Input input = new Input(list);
        input.fileInput();

        Calc calc = new Calc(list); // 제품의 이름과 어쩌구 들어간 리스트
        calc.calc();

        Sort sort = new Sort(list);
        sort.quickSort();

        Output output = new Output(list);
        output.labelPrint();
        output.print();

        System.out.println("Program is over...");

    }
}