# Copper Trace Metric Probe Walkthrough

This note is the quickest way to read the extra review model in `copper-trace-metric-probe`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 211 | ship |
| stress | latency skew | 169 | ship |
| edge | signal loss | 118 | watch |
| recovery | incident shape | 182 | ship |
| stale | span volume | 113 | watch |

Start with `baseline` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around latency skew and incident shape.
