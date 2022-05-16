import leetCode.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue


fun main() {
    assertFalse(isPowerOfTwo(0))
    assertTrue(isPowerOfTwo(1))
    assertTrue(isPowerOfTwo(2))
    assertTrue(isPowerOfTwo(4))
    assertTrue(isPowerOfTwo(8))
    assertTrue(isPowerOfTwo(16))
    assertTrue(isPowerOfTwo(32))
    assertTrue(isPowerOfTwo(64))
    assertTrue(isPowerOfTwo(128))
    assertTrue(isPowerOfTwo(256))
    assertTrue(isPowerOfTwo(512))
    assertTrue(isPowerOfTwo(1024))
    assertFalse(isPowerOfTwo(2147483647))

}