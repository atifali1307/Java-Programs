// Leetcode 981
// Time Based Key-Value Store

// Python Solution


class TimeMap:

    def __init__(self):
        self.dic = defaultdict(list)
        self.data = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.dic[key].append(timestamp)
        self.data[key].append(value)

    def get(self, key: str, timestamp: int) -> str:
        idx = bisect.bisect(self.dic[key], timestamp)
        if idx == 0:
            return ""
        return self.data[key][idx-1]