package org.wltea.analyzer.lucene;

import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.BaseTokenStreamTestCase;
import org.apache.lucene.analysis.TokenStream;
import org.junit.Test;

public class IKAnalyzerTest extends BaseTokenStreamTestCase {

	private final Analyzer analyzer = new IKAnalyzer(true);

	@Test
	public void tokenizeSuccess() throws IOException {
		String[] output = new String[] { "一下子", "一个月" };
		int[] startOff = new int[] { 0, 3 };
		int[] endOff = new int[] { 3, 6 };
		assertAnalyzesTo(analyzer, "一下子一个月", output, startOff, endOff);

		String[] types = new String[] { "CN_WORD", "CN_WORD" };
		TokenStream tokenStream = analyzer.tokenStream("", "一下子一个月");
		assertTokenStreamContents(tokenStream, output, types);
	}

}
