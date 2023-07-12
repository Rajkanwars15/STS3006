public class FibonacciServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n = Integer.parseInt(request.getParameter("n"));
        int fibonacci = Fibonacci.fibonacci(n);
        response.setContentType("text/plain");
        response.getWriter().write(String.valueOf(fibonacci));
    }
}