package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "servlet.ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kom1 = request.getParameter("kom1");
        String kom2 = request.getParameter("kom2");
        String kom3 = request.getParameter("kom3");
        String kom4 = request.getParameter("kom4");
        String kom5 = request.getParameter("kom5");
        String kom6 = request.getParameter("kom6");
        String kom7 = request.getParameter("kom7");
        String kom8 = request.getParameter("kom8");
        String kom9 = request.getParameter("kom9");
        String kom10 = request.getParameter("kom10");
        String kom11 = request.getParameter("kom11");
        String kom12 = request.getParameter("kom12");
        int randoms;
        int random;
        List<Integer> list = new ArrayList<>();
        List <Integer> arraysd = new ArrayList<>();
        List <String> son = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int kt=3;

        List<String> array = new ArrayList<>();
        array.add("      Elvin:   "+kom1);
        array.add("      Elvin:   "+kom2);
        array.add("      Elvin:   "+kom3);
        array.add("      Elvin:   "+kom4);

        List<String> array2 = new ArrayList<>();
        array2.add("      Elxan:   "+kom5);
        array2.add("      Elxan:   "+kom6);
        array2.add("      Elxan:   "+kom7);
        array2.add("      Elxan:   "+kom8);

        List<String> array3 = new ArrayList<>();
        array3.add("      Fexri:   "+kom9);
        array3.add("      Fexri:   "+kom10);
        array3.add("      Fexri:   "+kom11);
        array3.add("      Fexri:   "+kom12);
        int k = 4;

        List<String> arrays = new ArrayList<>();
        List<String> arrays2 = new ArrayList<>();
        List<String> arrays3 = new ArrayList<>();

        for (int i = 0; i<4;i++){
            random = (int)(Math.random()*k);
            arrays.add(array.get(random));
            array.remove(random);
            k--;
        }
        k = 4;
        for (int i = 0; i<4;i++){
            random = (int)(Math.random()*k);
            arrays2.add(array2.get(random));
            array2.remove(random);
            k--;
        }
        k = 4;
        for (int i = 0; i<=3;i++){
            random = (int)(Math.random()*k);
            arrays3.add(array3.get(random));
            array3.remove(random);
            k--;
        }

        for (int i = 0; i<2;i++){
            randoms = (int)(Math.random()*kt);
            arraysd.add(list.get(randoms));
            list.remove(randoms);
            kt--;
        }
        arraysd.add(list.get(0));
        for (int i =0; i<9;i++){
            arraysd.add(arraysd.get(i));
        }


        for (int j = 0; j<12;j+=2){
            if(arraysd.get(j)==1 && arraysd.get(j+1)==2){
                son.add(arrays.get(0));
                son.add(arrays2.get(0));
                arrays.remove(0);
                arrays2.remove(0);
            }else if(arraysd.get(j)==1 && arraysd.get(j+1)==3){
                son.add(arrays.get(0));
                son.add(arrays3.get(0));
                arrays.remove(0);
                arrays3.remove(0);
            }else if(arraysd.get(j)==2 && arraysd.get(j+1)==1){
                son.add(arrays2.get(0));
                son.add(arrays.get(0));
                arrays2.remove(0);
                arrays.remove(0);
            }else if(arraysd.get(j)==2 && arraysd.get(j+1)==3){
                son.add(arrays2.get(0));
                son.add(arrays3.get(0));
                arrays2.remove(0);
                arrays3.remove(0);
            }else if(arraysd.get(j)==3 && arraysd.get(j+1)==1){
                son.add(arrays3.get(0));
                son.add(arrays.get(0));
                arrays3.remove(0);
                arrays.remove(0);
            }else if(arraysd.get(j)==3 && arraysd.get(j+1)==2){
                son.add(arrays3.get(0));
                son.add(arrays2.get(0));
                arrays3.remove(0);
                arrays2.remove(0);
            }

        }
            try {
                request.setAttribute("list",son);
                request.getRequestDispatcher("netice.jsp").forward(request,response);
            }catch (Exception e){
                System.out.println(e);
            }



        System.out.println(son);



    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request,response);
    }
}
