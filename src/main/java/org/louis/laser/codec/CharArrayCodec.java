package org.louis.laser.codec;

import org.louis.laser.Context;
import org.louis.laser.Laser;
import org.louis.laser.io.InputStream;
import org.louis.laser.io.OutputStream;

public class CharArrayCodec implements Codec<char[]> {

	@Override
	public void encode(Laser laser, Context context, OutputStream out, char[] values) throws Exception {
		out.writeChars(values);
	}

	@Override
	public char[] decode(Laser laser, Context context, InputStream in, Class<char[]> type) throws Exception {
		return in.readChars();
	}

}
