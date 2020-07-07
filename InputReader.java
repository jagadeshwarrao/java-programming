import java.util.*;
import java.io.*;
import java.math.*;
class InputReader {
	 
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public String next() {
		return readString();
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}

class OutputWriter {
	private final PrintWriter writer;

	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}

	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}

	public void print(Object...objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}

	public void printLine(Object...objects) {
		print(objects);
		writer.println();
	}

	public void close() {
		writer.close();
	}

	public void flush() {
		writer.flush();
	}

	}

class IOUtils {

	public static int[] readIntArray(InputReader in, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.readInt();
		return array;
	}

	}
class Solution {
	
	static int i,j,n,k,l,m,tot, flag,h,r, K,x1,y1,x2,y2,x3,y3,mmx,mmy,x,y,z,timer,sz1,sz2;
	static int a[] = new int[100500];
	static int tin[] = new int[100500];
	static int tout[] = new int[100500];
	static int pr[] = new int[100500];
	static int b[] = new int[100500];
	static int d[] = new int[100500];
	static int up[][] = new int[100500][20];
	static int w[] = new int[100500];
	static int used[] = new int[100500];
	static int X1[] = new int[100500];
	static int Y1[] = new int[100500];
	static int X2[] = new int[100500];
	static int Y2[] = new int[100500];
	static List<List<Integer>> g=new ArrayList<>();
	static Map<Integer, Integer> trans = new HashMap<Integer, Integer>();
	static void dfs(int v, int lvl, int p)
	{
		tin[v] = timer;
		w[v] = lvl;
		up[v][0] = p;
		for (int i=1; i<=17; ++i)
			up[v][i] = up[up[v][i-1]][i-1];
		for(int i = 0; i < g.get(v).size(); i++)
		{
			int to = g.get(v).get(i);
			if (to != p)
			{
			   dfs(to, lvl+1, v);
			   pr[to] = v;
			}
		}
		tout[v] = timer++;
	}
	static boolean upper(int x, int y)
	{
		return tout[x] >= tout[y] && tin[x] <= tin[y];
	}
	static int lca (int a, int b) {
		if (upper (a, b))  return a;
		if (upper (b, a))  return b;
		for (int i=17; i>=0; --i)
			if (! upper (up[a][i], b))
				a = up[a][i];
		return up[a][0];
	}
	public static void main(String[] args) throws IOException{
		InputReader sc = new InputReader(System.in);//new File("input.txt"));
		OutputWriter  pw = new OutputWriter(System.out);//new File("output.txt"));
	    n = sc.readInt();
	    m = sc.readInt();
	    b[0] = 0;
		for (i = 1; i <= n; i++)
		{
			a[i] = sc.readInt();
			b[i] = 0;
			if (!trans.containsKey(a[i]))
				trans.put(a[i], j++);
			g.add(new ArrayList<>());
		}
		g.add(new ArrayList<>());
		for (i = 1; i <= n; i++)
			a[i] = trans.get(a[i]);
		for (i = 0; i < n-1; i++)
		{
			x = sc.readInt();
			y = sc.readInt();
			g.get(x).add(y);
			g.get(y).add(x);
		}
		dfs(1, 0, 1);
		for (i = 0; i < m; i++)
		{
			x1 = sc.readInt();
			y1 = sc.readInt();
			x2 = sc.readInt();
			y2 = sc.readInt();
			X1[i] = x1;
			Y1[i] = y1;
			X2[i] = x2;
			Y2[i] = y2;

			int lc1 = lca(x1,y1);
			int lc2 = lca(x2,y2);
			int ans1 = 0;
			if (lc1 == lc2)
			{

				int lc3 = lca(x1,x2);
				int lc4 = lca(x1,y2);
				int lc5 = lca(y1,x2);
				int lc6 = lca(y1,y2);
				ans1++;
				ans1 += w[lc3]-w[lc1];
				ans1 += w[lc4]-w[lc1];
				ans1 += w[lc5]-w[lc1];
				ans1 += w[lc6]-w[lc1];
			} else
			if (w[lc1] < w[lc2])
			{

				int lc3 = lca(x1,x2);
				int lc4 = lca(x1,y2);
				int lc5 = lca(y1,x2);
				int lc6 = lca(y1,y2);
				if (upper(lc2,x1) && upper(lc1,lc2))
				{					
					ans1 += Math.abs(w[lc3]-w[lc4])+1;
				}
				if (upper(lc2,y1) && upper(lc1,lc2))
				{
					ans1 += Math.abs(w[lc5]-w[lc6])+1;
				}
			} else
			if (w[lc1] > w[lc2])
			{

				int lc3 = lca(x1,x2);
				int lc4 = lca(x1,y2);
				int lc5 = lca(y1,x2);
				int lc6 = lca(y1,y2);
				if (upper(lc1,x2) && upper(lc2,lc1))
				{
					ans1 += Math.abs(w[lc3]-w[lc5])+1;
				}
				if (upper(lc1,y2) && upper(lc2,lc1))
				{
					ans1 += Math.abs(w[lc4]-w[lc6])+1;
				}
			}
			d[i] = ans1;
			/*if (w[x1]+w[y1]-w[lc1]>w[x2]+w[y2]-w[lc2])
			{
				x3 = x1; x1 = x2; x2 = x3;
				y3 = y1; y1 = y2; y2 = y3;
				x3 = lc1; lc1 = lc2; lc2 = x3;
			}*/
		}
		for (i = 0; i < m; i++)
		{
			x1 = X1[i];
			y1 = Y1[i];
			x2 = X2[i];
			y2 = Y2[i];
			int ans = 0;
			x3 = x1; y3 = y1;
			while (!upper(x1,y1))
			{
				++b[a[x1]];
				x1 = pr[x1];
			}
			while (y1 != x1)
			{
				++b[a[y1]];
				y1 = pr[y1];
			}
			b[a[x1]]++;

			while (!upper(x2,y2))
			{
				ans+=b[a[x2]];
				x2 = pr[x2];
			}
			while (y2 != x2)
			{
				ans+=b[a[y2]];
				y2 = pr[y2];
			}
			ans+=b[a[x2]];
			
			int tmp = x1;
			x1 = x3; y1 = y3;
			while (x1 != tmp)
			{
				b[a[x1]] = 0;
				x1 = pr[x1];
			}
			while (y1 != tmp)
			{
				b[a[y1]] = 0;
				y1 = pr[y1];
			}
			b[a[x1]] = 0;		
			pw.printLine(ans-d[i]);
		}
		pw.close();
	}
} 