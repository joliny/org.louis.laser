package org.louis.laser.codec;

import org.louis.laser.Laser;
import org.louis.laser.io.InputStream;
import org.louis.laser.io.OutputStream;

public class LongArrayCodec implements Codec<long[]> {

	@Override
	public void encode(Laser laser, OutputStream out, long[] values) throws Exception {
		out.writeLongs(values);
	}

	@Override
	public long[] decode(Laser laser, InputStream in, Class<long[]> type) throws Exception {
		return in.readLongs();
	}
}