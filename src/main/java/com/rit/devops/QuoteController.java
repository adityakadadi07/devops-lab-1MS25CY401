package com.rit.devops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;
@RestController
public class QuoteController {
private final List&lt;String&gt; quotes = List.of(
&quot;Automate everything that you do more than twice.&quot;,
&quot;It works on my machine is not a deployment strategy.&quot;,
&quot;&lt;-- REPLACE THIS WITH A QUOTE OF YOUR OWN --&gt;&quot;
);
@GetMapping(&quot;/quote&quot;)
public String quote() {
return quotes.get(new Random().nextInt(quotes.size()));
}
@GetMapping(&quot;/health&quot;)
public String health() {
return &quot;OK&quot;;
}
}
