// Urbano, Mike
// mxu2814
// 2018-11-30

public class hmwk_04_imperative {
  // Sum of squares
  static long  sumOfSquares( long i ){
    if( i == 0 ) return 0;
    else return sumOfSquares( i - 1 ) + ( i * i ); }
  // Pell numbers
  static long pell( long i ){
    if( i <= 2 ) return i;
    else return 2 * pell( i - 1 ) + pell( i - 2 ); }
  // Powers
  static long powers( long i, long j ){
    if(j==0) return i - 1;
    else return i - 1 + i * powers(i,j-1);
    }

  //----------------------------------------------------------
  public static void main( String[] args )
  {
    for ( Long i = 0L; i <= 15; i++ ) {
      System.out.format( "sumOfSquares(%d) is %d\n", i, sumOfSquares(i) );
    }

    for ( Long i = 0L; i <= 15; i++ ) {
      System.out.format( "pell(%d) is %d\n", i, pell(i) );
    }

    for ( Long i = 2L; i <= 10; i++ ) {
      for ( Long j = 1L; j <= 10; j++ ) {
        System.out.format( "powers(%d, %d) is %d\n", i, j, powers( i, j ) );
      }
    }
  }
}
