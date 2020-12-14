package wordgame;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class wordlist
{
	public static String loadFile()
	{
		List<String> list = null;
		URI uri = null;

		try
		{
			uri = ClassLoader
					.getSystemResource(
							"C:\\Users\\Administrator\\Desktop\\PROJECTS OFFICIAL\\2020\\wordgame\\src\\lingowords.txt")
					.toURI();
		} catch (URISyntaxException e)
		{
			LOGGER.error("Failed to load file.", e);
		}

		try (Stream<String> lines = Files.lines(Paths.get(uri)))
		{
			list = lines.collect(Collectors.toList());
		} catch (IOException e)
		{
			LOGGER.error("Failed to load file.", e);
		}
		return list;
	}
}
