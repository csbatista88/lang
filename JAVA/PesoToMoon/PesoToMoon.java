class PesoToMoon {
	public static void main(String args[]) {
		double  P, m, g, m_l, M;
	
		m = 80.0;
		
		m_l = 0.166;
		g = 1.62;
		P = m * g;
		M = m * m_l;
		
		System.out.println(P + "N seu peso na lua.");
		System.out.println(M + "kg massa na lua.");
		
	}
}
