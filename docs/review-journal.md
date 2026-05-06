# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 211, lane `ship`
- `stress`: `latency skew`, score 169, lane `ship`
- `edge`: `signal loss`, score 118, lane `watch`
- `recovery`: `incident shape`, score 182, lane `ship`
- `stale`: `span volume`, score 113, lane `watch`

## Note

This file is intentionally plain so the fixture remains the source of truth.
