import java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler 
{
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.

    ArrayList<String> queries = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Hello! This server tracks and adds strings!");
        } 
        else 
        {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) 
            {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) 
                {
                    queries.add(parameters[1]);
                    System.out.println("queries: " + queries);
                    return String.format("String added!");
                }
            }
            else if (url.getPath().contains("/search"))
            {
                String[] searchParameters = url.getQuery().split("=");
                if (searchParameters[0].equals("s")) 
                { 
                    if (searchParameters.length < 2)
                    {
                        return String.format("<b>Search Complete</b>! \n%s", queries);
                    }

                    String searchQueries = "";
                    for (String i : queries)
                    {
                        if(i.contains(searchParameters[1]))
                        {
                            searchQueries += i + "\n";
                        }
                    }
                    return String.format("<b>Search Complete</b>! \n%s", searchQueries);
                }
            }

        return "404 Not Found!";
        }
    }
}

class SearchEngine 
{
    public static void main(String[] args) throws IOException 
    {
        if(args.length == 0)
        {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
